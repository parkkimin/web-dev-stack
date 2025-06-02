/*
https://api.upbit.com/v1/market/all
{
    "market": "KRW-BTC",
    "korean_name": "비트코인",
    "english_name": "Bitcoin"
  },
*/

//async function dataFetch() {}
//const dataFetch= async function(){}
const dataFetch = async () => {
  const response = await fetch("https://api.upbit.com/v1/market/all");
  const data = await response.json();
  console.log(data);
  /* 
  for (let i = 0; i < Date.length; i++) {
    console.log(data[i]);
  }
    */
  /* data.forEach((item) => {
    //startsWith : 시작하는 단어 여부, includes : 포함 여부
    if (item.market.startsWith("KRW")) {
      market.innerHTML += `<h2>${item.korean_name}${item.market}</h2>`;
    }

    console.log(item.market, item.market.includes("KRW"));
    console.log(item.korean_name);
  });*/
  //forEach+조건문 -> filter
  const krwMarkets = data.filter((item) => item.market.includes("KRW"));
  /*
  let markets = "";
  krwMarkets.forEach((item) => {
    markets += item.market + ",";
  });
  console.log(markets.slice(0, -1));
*/
  //forEach + 내가 원하는 형태로 가공하자고 할때-> map
  const markets = krwMarkets.map((item) => item.market).join(",");

  const tickerResponse = await fetch(
    `https://api.upbit.com/v1/ticker?markets=${markets}`
  );
  const tickerDate = await tickerResponse.json();
  console.log(tickerDate);

  krwMarkets.forEach((item) => {
    const ticker = tickerDate.find((ticker) => ticker.market === item.market);
    market.innerHTML += `<h2>${item.korean_name}${item.market}</h2>
    <p>현재가: ${ticker.trade_price.toLocaleString()}원</p>
    <p>24시간 거래량: ${ticker.acc_trade_volume_24h.toFixed(2)}</p>
    <p>전일 대비: ${
      ticker.change === `RISE`
        ? "상승"
        : ticker.change === "FALL"
        ? "하락"
        : "보합"
    }(${(ticker.change_rate * 100).toFixed(2)}%)</p>`;
  });
};
dataFetch();
