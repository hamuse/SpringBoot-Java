<template>
	<div class="layout" id="wrapper">
		<header>
			<slot name="header" :title="header"></slot> <!-- 슬롯은 무조건 name을 가져야 한다. -->
		</header>
		<aside id="sidebar">  <!-- 시멘틱 -->
			<slot name="sidebar"></slot> <!-- 슬롯은 무조건 name을 가져야 한다. -->
		</aside>
		<section id="content">
			<slot name="content" :title="content"></slot> <!-- 슬롯은 무조건 name을 가져야 한다. -->
		</section>
		<footer id="footer">
			<slot name="footer" :title="footer"></slot> <!-- 슬롯은 무조건 name을 가져야 한다. -->
		</footer>
	</div>
</template>
<script>
export default{
	data(){
	return{
		header: "헤더 타이틀",
		content: "컨텐트  타이틀",
		footer: "푸터 타이틀"
		}
	}
}
</script>
<style scoped>
/* 전체 구조 */
#wrapper {
     padding: 5px;
     width: 960px;
     margin: 20px auto;
}
header {
     height: 100px;
     padding: 0 15px;
	background: cornflowerblue;
     border-radius:0.5em;
}
#content {
     width: 696px;
     float: left;
     padding: 5px 15px;
    min-height: 300px;
    border-radius:0.5em;
}
#sidebar {
     width: 200px;
     padding: 5px 15px;
     float: left;
     border-radius:0.5em;
}
footer {
     clear: both;
     padding: 0 15px;
     border-radius:0.5em;
}
/* 가로폭 980보다 작을 때 사용할 @media query */
@media screen and (max-width: 980px) {     
     #pagewrap {
           width: 94%;
     }
     #content {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     #sidebar {
           clear: both;
           padding: 1% 4%;
           width: auto;
           float: none;
     }
     header, footer {
           padding: 1% 4%;
     }
}
/* 공통 */
#content {
     background: steelblue;
}
#sidebar {
     background: steelblue;
}
header, #content, #middle, #sidebar {
     margin-bottom: 5px;
	
}
#pagewrap, header, #content, #middle, #sidebar, footer {
     border: solid 1px #ccc;
}
</style>