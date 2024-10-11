document.addEventListener("DOMContentLoaded", function () {
  // 공지사항 데이터
  const noticeDetails = {
      1: "제9회 빅데이터분석기사 8시작시험 심사 서류 제출에 대한 세부 내용입니다...",
      2: "제33회 데이터분석 준전문가(ADsP) 시험의 세부 내용입니다...",
      // 추가 공지사항 데이터
  };

  const noticeItems = document.querySelectorAll(".notice-item");
  const detailSection = document.getElementById("notice-detail");
  const detailContent = document.getElementById("detail-content");

  noticeItems.forEach(item => {
      item.addEventListener("click", function () {
          const noticeId = item.getAttribute("data-id");
          const detailText = noticeDetails[noticeId] || "해당 공지사항의 상세 내용이 없습니다.";
          
          // 상세 내용을 업데이트하고, 상세 영역을 보이게 설정
          detailContent.innerText = detailText;
          detailSection.classList.remove("hidden");
      });
  });
});
