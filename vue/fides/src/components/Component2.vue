<template>
    <div id="component2">
      <img id="component2-chess1" src="../assets/component2/chess1.png">
      <img id="component2-chess2" src="../assets/component2/chess2.png">

      <div id="component2-box1">
        <h1 id="component2-box1-title">피데스란?</h1>
        <p id="component2-box1-text">Fides는 투자를 게임처럼 즐기고 커뮤니티의 기능을 적극적으로 활용하며 투자에 대한 다양한 기능을 적용할 수 있도록
        핵심 기능들을 선보일 예정입니다.</p>
        <img id ="component2-box1-button" src="../assets/component2/button.png">
        <img id = "component2-box1-icon" src="../assets/component2/box1-icon.png">
      </div>

      <div id="component2-box2">
        <h1 id="component2-box2-title">당신의 차별화된 장점을 Tier 제도로 살려보세요</h1>
        <p id="component2-box2-text">피데스는 다양한 티어제도를 도입하여 당신의 역량을 살리고, 투자 능력을 더 발휘할 수 있도록 돕습니다. 또한 이를 통해
        DAO에서 더 효율적인 의사소통을 가능하도록 할 것입니다.</p>
        <img id ="component2-box2-button" src="../assets/component2/button.png">
        <img id = "component2-box2-icon" src="../assets/component2/box2-icon.png">
      </div>

      <div id="component2-box3">
        <h1 id="component2-box3-title">벤쳐 캐피탈의 일원으로서 프로젝트에 투자자, 테스터, 창립멤버로 참여</h1>
        <p id="component2-box3-text">직접적인 투자 뿐 아니라 간접적인 투자로 진행하며, 협의에 따른 토크노믹스의 일정 비율 혹은 멤버 혹은 기여자로 참여할 수 있는
        기회를 얻게됩니다.</p>
        <img id ="component2-box3-button" src="../assets/component2/button.png">
        <img id = "component2-box3-icon" src="../assets/component2/box3-icon.png">
      </div>

      <div id="component2-box4">
        <h1 id="component2-box4-title">투자에 대한 정보 탐색과 논의, 토론</h1>
        <p id="component2-box4-text">DAO의 활성화는 단순 투표가 아닌 적극적인 논의와 토론을 통해 가능하진다고 생각합니다. 토론과 정보 굥유, 의논을 통해
        길드 내에서 확실한 성과 창출이 가능할 것이며 이를 통해 더 빠른 성장을 도모할 수 있습니다. 커뮤니티에서 다양한 기능과 게임파이를 통해 성과 뿐 아니라 재미와
        효율적으로 갖출 수 있는 시스템을 도입할 것입니다.</p>
        <img id="component2-box4-button" src="../assets/component2/button.png">
        <img id="component2-box4-icon" src="../assets/component2/box4-icon.png">
      </div>
    </div>
</template>

<script>
export default {
  name: 'component2',
  components: {
  }
}
</script>

<style>
#component2{
  position: absolute;
  width: 1600px;
  height: 1040px;
  left: -800px;
  top: 615px;
  background: #EDEDF2;
}
#component2-chess1 {
   position: absolute;
   height: 268px;
   width: 134px;
   left: 1300px;
   top: 105px;
   border-radius: 0px;
   background: rgba( 255, 255, 255, 0 );
}

#component2-chess2 {
  position: absolute;
  height: 248px;
  width: 144px;
  left: 150px;
  top: 848px;
  border-radius: 0px;
  background: rgba( 255, 255, 255, 0 );
}
#component2-box1{
  position: absolute;
  width: 380px;
  height: 530px;
  left: 410px;
  top: 44px;
  background: #F5F8FC;
  border-radius: 20px;
}
#component2-box1:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 10px 18px;
 }
#component2-box2{
  position: absolute;
  height: 346px;
  width: 380px;
  left: 810px;
  top: 44px;
  border-radius: 20px;
  background: #F5F8FC;
}
#component2-box2:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 10px 18px;
 }
#component2-box3{
  position: absolute;
  width: 380px;
  height: 346px;
  left: 410px;
  top: 612px;
  background: #F5F8FC;
  border-radius: 20px;
}
#component2-box3:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 10px 18px;
 }
#component2-box4{
  position: absolute;
  width: 380px;
  height: 534px;
  left: 810px;
  top: 424px;
  background: #F5F8FC;
  border-radius: 20px;
}
#component2-box4:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 10px 18px;
 }
#component2-box1-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 44px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #000000;
  text-align: left;
}
#component2-box1-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 80px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box1-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 50px;
  top: 180px;
  box-sizing: border-box;
  border-radius: 20px;
  text-align: left;
}
#component2-box1-icon{
  position: absolute;
  width: 308.18px;
  height: 205.1px;
  left: 12px;
  top: 266px;
}
#component2-box2-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 44px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #000000;
  text-align: left;
}
#component2-box2-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 80px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box2-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 50px;
  top: 180px;
  box-sizing: border-box;
  border-radius: 20px;
}
#component2-box2-icon{
  position: absolute;
  width: 235.78px;
  height: 183.26px;
  left: 112px;
  top: 162.746px;
}

#component2-box3-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 40px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 22px;
  line-height: 16px;
  /* identical to box height, or 73% */
  color: #000000;
  text-align: left;
}
#component2-box3-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 76px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box3-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 50px;
  top: 176px;
  box-sizing: border-box;
  border-radius: 20px;
}
#component2-box3-icon{
  position: absolute;
  height: 154.47857666015625px;
  width: 262.3983459472656px;
  left: 117.46px;
  top: 190px;
  border-radius: 0px;
}
#component2-box4-title{
  position: absolute;
  width: 280px;
  height: 16px;
  left: 50px;
  top: 44px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 22px;
  line-height: 16px;
  text-align: left;
}
#component2-box4-text{
  position: absolute;
  width: 280px;
  height: 60px;
  left: 50px;
  top: 80px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
}
#component2-box4-button{
  position: absolute;
  width: 70px;
  height: 38px;
  left: 50px;
  top: 180px;
  box-sizing: border-box;
  border-radius: 20px;
}
#component2-box4-icon{
  position: absolute;
  width: 303.36px;
  height: 190.28px;
  left: 50px;
  top: 312px;
}
</style>
