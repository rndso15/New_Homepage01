/**
 * 
 */
function showClock() 
{
	var currentDate = new Date();
	var divClock = document.getElementById("divClock");

	var msg = "현재 시간 : " + currentDate.getHours() + "시 "
	msg += currentDate.getMinutes() + "분 ";
	msg += currentDate.getSeconds() + "초 ";

	divClock.innerText = msg;
	setTimeout(showClock, 1000);
}

showClock();