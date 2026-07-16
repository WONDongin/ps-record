const { ChartJSNodeCanvas } = require("chartjs-node-canvas");
const fs = require("fs");

const width = 1100;
const height = 500;

const raw = fs.readFileSync("data.json");
const { labels, monthly } = JSON.parse(raw);

// 누적 계산
const cumulative = [];
monthly.reduce((sum, value) => {
    sum += value;
    cumulative.push(sum);
    return sum;
}, 0);

const chartJSNodeCanvas = new ChartJSNodeCanvas({
    width,
    height,
    backgroundColour: "#0d1117"
});

const configuration = {
    data: {
        labels,
        datasets: [
            {
                type: "bar",
                label: "월별 풀이",
                data: monthly,
                backgroundColor: "rgba(88,166,255,0.65)",
                borderColor: "#58a6ff",
                borderWidth: 1,
                borderRadius: 6,
                yAxisID: "y"
            },
            {
                type: "line",
                label: "누적 풀이",
                data: cumulative,
                borderColor: "#2ea043",
                backgroundColor: "#2ea043",
                borderWidth: 3,
                tension: 0.35,
                pointRadius: 5,
                pointHoverRadius: 7,
                pointBackgroundColor: "#2ea043",
                fill: false,
                yAxisID: "y1"
            }
        ]
    },
    options: {
        responsive: false,
        plugins: {
            title: {
                display: true,
                text: "Programmers Algorithm Progress",
                color: "#ffffff",
                font: {
                    size: 22
                }
            },
            legend: {
                labels: {
                    color: "#ffffff",
                    font: {
                        size: 13
                    }
                }
            }
        },
        scales: {
            x: {
                ticks: {
                    color: "#ffffff"
                },
                grid: {
                    color: "#30363d"
                }
            },
            y: {
                position: "left",
                beginAtZero: true,
                title: {
                    display: true,
                    text: "Monthly",
                    color: "#58a6ff"
                },
                ticks: {
                    color: "#58a6ff"
                },
                grid: {
                    color: "#30363d"
                }
            },
            y1: {
                position: "right",
                beginAtZero: true,
                title: {
                    display: true,
                    text: "Cumulative",
                    color: "#2ea043"
                },
                ticks: {
                    color: "#2ea043"
                },
                grid: {
                    drawOnChartArea: false
                }
            }
        }
    }
};

(async () => {
    const image = await chartJSNodeCanvas.renderToBuffer(configuration);
    fs.writeFileSync("graph.png", image);
    console.log("✅ graph.png 생성 완료");
})();