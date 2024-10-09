function showContent(sectionId) {
  // 모든 섹션 숨기기
  var sections = document.getElementsByClassName('content-section');
  for (var i = 0; i < sections.length; i++) {
      sections[i].style.display = 'none';
  }

  // 선택한 섹션만 보이게 하기
  document.getElementById(sectionId).style.display = 'block';
}

function viewScheduleDetail() {
  alert("일정 상세 보기 기능 구현 중...");
}
