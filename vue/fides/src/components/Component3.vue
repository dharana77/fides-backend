<template>
    <div id="component3">
          <div id="component3-explain-box">
            <span class="fides-explain-title">피데스 주요 기능</span><br>
            <span class="fides-explain-text">피데스는 벤쳐 캐피탈을 탈중앙화하여 수익을 프로젝트 일원에게 환원하는 것을 목표로 합니다.<br>
            개발 기능 중 일부는 다음과 같습니다.</span>
          </div>

          <div id="component3-explain-contents1">
            <h1 class="contents1-title" id="component3-box1-title">베타 수익</h1>
            <p class="contents1-text" id="component3-box1-text">펀드 시스템 중 일부인 베타 수익에서, 피데스는
            최소 시장의 성장 만큼의 이윤을 얻기 위한 성장 방법을 고안합니다.
            시장 하락에 대한 리스크를 방지할 수 있고 꾸준한 수익을 통해 성장을 고안할 수 있습니다.</p>
            <h3 class="detail" id="component3-box1-detail">View Detail</h3>
            <img id="component3-line1">
          </div>

          <div id="component3-explain-contents2">
            <h1 class="contents2-title" id="component3-box2-title">N분의1 투자</h1>
            <p class="contents2-text" id="component3-box2-text">시스템을 통해 투자 자산에 대한 n분의 1투자를 진행할 수 있습니다.
            마켓플레이스가 형성되며, 보유자들은 해당 권리를 마켓 플레이스에서 매수 매도 할 수 있습니다.
            </p>
            <h3 class="detail" id="component3-box2-detail">View Detail</h3>
            <img id="component3-line2">
          </div>

          <div id="component3-explain-contents3">
            <h1 class="contents3-title" id="component3-box3-title">프로젝트 런칭 및 IDO</h1>
            <p class="contents3-text" id="component3-box3-text">자체 프로젝트 런칭 및 타 프로젝트 IDO 참여가 있으며,
            투자여부에 따른 베타테스터 권한을 얻게됩니다. 정보를 선점할 수 있으며 차후 성장에 따라 대형 벤쳐캐피탈 만큼의 좋은 조건에서
            초기 선점 및 투자를 가능하게 만들고 이를 사용자들에게 배분하는 것이 목표입니다.
            </p>
            <h3 class="detail" id="component3-box3-detail">View Detail</h3>
            <img id="component3-line3">
          </div>
    </div>
</template>

<script>
export default {
  name: 'component3',
  components: {
  }
}
</script>

<style>
#component3{
  position: absolute;
  width: 1600px;
  left: -800px;
}

#component3-explain-box{
  position: absolute;
  width: 780px;
  height: 142px;
  left: 410px;
  top: 1735px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
  color: #0F8D7C;
  text-align:left;
}

.fides-explain-title{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
  color: #1CAE9A;
}
.fides-explain-text{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 36px;
  color: black;
}
#component3-explain-contents1{
 position: absolute;
 width: 380px;
 height: 290px;
 left: 210px;
 top: 1917px;
 background: #F9F9F9;
 border-radius: 20px;
 }
 #component3-explain-contents1:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 4px 12px;
 }
#component3-explain-contents2{
  position: absolute;
  width: 380px;
  height: 290px;
  left: 610px;
  top: 1917px;
  background: #F9F9F9;
  border-radius: 20px;
}
 #component3-explain-contents2:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 4px 12px;
 }
#component3-explain-contents3{
  position: absolute;
  width: 380px;
  height: 290px;
  left: 1010px;
  top: 1917px;
  background: #F9F9F9;
  border-radius: 20px;
}
#component3-explain-contents3:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 4px 12px;
 }
.contents1-title, .contents2-title, .contents3-title{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 26px;
  /* or 87% */
  color: #1CAE9A;
  margin: 10% 0 10% 0;
}
.contents1-text, .contents2-text, .contents3-text{
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
  margin: 0 0 10% 0;
}
.detail{
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 14px;
  /* or 87% */
  color: #96BEB9;
}
#component3-line1{
  position: absolute;
  width: 340px;
  height: 1px;
  left: 20px;
  top: 229px;
  background: #96BEB9;
}
#component3-line2{
 position: absolute;
 width: 340px;
 height: 1px;
 left: 20px;
 top: 229px;
 background: #96BEB9;
}
#component3-line3{
  position: absolute;
  width: 340px;
  height: 1px;
  left: 20px;
  top: 229px;
  background: #96BEB9;
}
#component3-box1-detail{
  position: absolute;
  left: 20px;
  top: 242px;
}
#component3-box1-detail, #component3-box2-detail, #component3-box3-detail{
  position: absolute;
  left: 20px;
  top: 242px;
}
#component3-box1-title, #component3-box2-title, #component3-box3-title{
  position: absolute;
  text-align: left;
  left: 20px;
}
#component3-box1-text, #component3-box2-text, #component3-box3-text{
  position: absolute;
  text-align: left;
  left: 20px;
  top: 109px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
}
</style>
