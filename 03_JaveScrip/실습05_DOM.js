const currnetTime = () => {
  const weeks = ["일", "월", "화", "수", "목", "금", "토"];
  const today = new Date();
  console.log(today);
  console.log(today.getFullYear()); //년
  console.log(today.getMonth() + 1); //월 (0 : 1월)
  console.log(today.getDate()); //일
  console.log(today.getDay()); //요일 (0 : 일, 1 : 월)
  console.log(weeks[today.getDay()]);
  const year = today.getFullYear();
  const month = today.getMonth() + 1;
  const day = today.getDate();
  const week = weeks[today.getDay()];
  const currnet = document.querySelector("#current");
  currnet.textContent = `${year}년 ${month}월 ${day}일 (${week})`;

  const time = today.getHours();
  const time1 = today.getMinutes();
  const time2 = String(today.getSeconds()).padStart(2, "0");

  const h1 = document.querySelector("h1");
  h1.textContent = `${time}:${time1}:${time2}`;
};

//내장객체 타이머 참고

const randomBackground = () => {
  const body = document.body;
  const r = Math.floor(Math.random() * 256);
  const g = Math.floor(Math.random() * 256);
  const b = Math.floor(Math.random() * 256);
  body.style.background = `rgba(${r},${g},${b}, 0.4)`;
};

const count = () => {
  const last = new Date("2026-01-01 00:00:00"); // 목표하는 날짜
  const now = new Date();
  //console.log(Math.floor((last - now) / 1000));
  const second = Math.floor((last - now) / 1000); //1초== 밀리세컨드/1000
  const minute = Math.floor(second / 60); // 60초를 1분
  const hour = Math.floor(minute / 60); //60분 1시간
  const day = Math.floor(hour / 60); //24시간 1하루
  console.log(day);
  console.log(hour % 24);
  console.log(minute % 60);
  console.log(second % 60);
  const count = document.querySelector("#count");
  count.textContent = `올해 남은 시간
   ${day}일 
   ${hour % 24}시간
   ${minute % 60}분
   ${second % 60}초`;
};

import quotes from "./quotes.js";

const randomQuote = () => {
  const random = quotes[Math.floor(Math.random() * quotes.length)];
  const quoteE = document.querySelector("#quoteE");
  const quoteK = document.querySelector("#quoteK");
  console.log(random.en);
  console.log(random.ko);
  quoteE.textContent = random.en;
  quoteK.textContent = random.ko;
};

currnetTime();
randomBackground();
count();
randomQuote();

setInterval(() => {
  currnetTime();
  count();
}, 1000);

setInterval(() => {
  randomBackground();
  randomQuote();
}, 3000);
