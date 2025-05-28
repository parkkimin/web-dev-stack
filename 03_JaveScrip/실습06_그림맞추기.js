window.addEventListener("DOMContentLoaded", () => {
  const header = document.querySelector("h2");
  header.textContent = "그림 맞추기 게임";
  const p = document.querySelector("p");
  p.textContent =
    "버튼을 클릭하면,그림이 출력 됩니다. 모두 같은 그림이 나오면 승리";
  const aside = document.querySelector("h2");
  aside.textContent = "축하합니다! 다시 시작하려면 재시작 버튼을 눌러주세요!";

  const img = document.querySelectorAll("img");
  console.log(img);
});
