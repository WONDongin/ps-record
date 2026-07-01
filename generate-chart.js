const { ChartJSNodeCanvas } = require('chartjs-node-canvas');
const fs = require('fs');

const width = 800;
const height = 400;

const raw = fs.readFileSync('data.json');
const { values } = JSON.parse(raw);

const chartJSNodeCanvas = new ChartJSNodeCanvas({
    width,
    height,
    backgroundColour: '#0d1117'
});

const configuration = {
    type: 'line',
    data: {
        labels: Array.from({ length: values.length }, (_, i) => i + 1),
        datasets: [{
            label: '7월 프로그래머스 알고리즘 풀이 추이',
            data: values,
            borderColor: '#58a6ff',
            backgroundColor: 'rgba(88,166,255,0.2)',
            tension: 0.4,                // 더 부드럽게
            borderWidth: 2,              // 선 두께
            pointRadius: 4,              // 점 크기
            pointBackgroundColor: '#58a6ff'
        }]
    },
    options: {
        responsive: false,
        plugins: {
            legend: {
                labels: { color: '#ffffff' }
            }
        },
        scales: {
            x: {
                ticks: { color: '#ffffff' }
            },
            y: {
                min: 0,
                max: 10,
                ticks: { color: '#ffffff' }
            }
        }
    }
};

(async () => {
    const image = await chartJSNodeCanvas.renderToBuffer(configuration);
    fs.writeFileSync('graph.png', image);
    console.log('✅ graph.png 생성 완료');
})();