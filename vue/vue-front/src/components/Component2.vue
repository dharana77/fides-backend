<template>
    <div id="component2">
      <img id="chess1" src="../assets/Chess1.png">
      <img id="chess2" src="../assets/Chess2.png">
      <div id="box1-wrapper">
        <div id="box1">
          <h1>Lean More About Fides</h1>
          <p>Fides is the new wave for Investing crypto asset, We can devide the right
             and the seed money</p>
          <img id ="info" src="../assets/arrow_button.png">
          <img id = "info_icon" src="../assets/info_icon.png">
        </div>
        <div id="box2">
          <h1>Become Speaker Tier</h1>
          <p>Fides is the new wave for Investing crypto asset, We can devide the right
             and the seed money</p>
          <img id ="tier" src="../assets/arrow_button.png">
          <img id = "tier_icon" src="../assets/tier_icon.png">
        </div>
      </div>
      <div id="box3-content">
        <h1>Build Your Community</h1>
        <p>Fides is the new wave for Investing crypto asset, We can devide the right
           and the seed money</p>
        <img id ="subdao" src="../assets/arrow_button.png">
        <img id = "subdao_icon" src="../assets/subdao_icon.png">
      </div>
      <div id="box4">
        <h1>Join Out Community</h1>
        <p>Fides is the new wave for Investing crypto asset, We can devide the right
           and the seed money</p>
        <img id="community" src="../assets/arrow_button.png">
        <img id="community_icon" src="../assets/community_icon.png">
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
  width: 100%;
  height: 1048px;
  left: 0px;
  top: 607px;
  background: #EDEDF2;
}
#chess1 {
  height: 267.17490145529985px;
  width: 113.27063209377528px;
  top: 655px;
  border-radius: 0px;
  position: absolute;
  left: 89.8%;
  right: 3.12%;
  bottom: 78.58%;
  background: rgba( 255, 255, 255, 0 );
}
#chess2 {
  position: absolute;
  height: 247.28165346559211px;
  width: 119.18116349536974px;
  left: 150px;
  top: 1485.837646484375px;
  border-radius: 0px;
  background: rgba( 255, 255, 255, 0 );
}

#box1-wrapper{
  position: relative;
  top: 5%;
}
#box1-wrapper > div{
  float: left;
}

#box1{
  position: relative;
  width: 380px;
  height: 530px;
  left: 25%;
  background: #F5F8FC;
  border-radius: 20px;
}
#box2{
  position: relative;
  width: 380px;
  height: 346px;
  background: #F5F8FC;
  border-radius: 20px;
  left: 27%;
}
#box3-content{
  position: relative;
  clear: both;
  top: 8%;
  left: 25%;
  width: 380px;
  height: 346px;
  background: #F5F8FC;
  border-radius: 20px;
  float: left;
}
#box4{
  position: relative;
  width: 380px;
  height: 534px;
  background: #F5F8FC;
  border-radius: 20px;
  float: right;
  left: -19%;
  top: -10%;
}
#info, #tier, #subdao,#community{
  background: white;
}
#info_icon, #tier_icon, #subdao_icon, #community_icon{
  background:white;
}
#info_icon{
  width: 308.18px;
  height: 205.1px;
  left: 460.36px;
  top: 947px;
  transform: rotate(10.78deg);
}
#tier_icon{
  width: 235.78px;
  height: 183.26px;
  left: 922px;
  top: 855.56px;
  transform: rotate(deg);
}
#subdao_icon{
  left: 35.25%;
  right: 48.35%;
  top: 30.56%;
  bottom: 65.52%;
  height: 184.4870147705078px;
  width: 262.3983459472656px;
  left: 564px;
  top: 1439px;
  border-radius: 0px;

}
#community_icon{
  width: 303.36px;
  height: 190.28px;
  left: 860px;
  top: 1373px;
}
</style>
