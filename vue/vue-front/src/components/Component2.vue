<template>
    <div id="component2">
      <img id="chess1" src="../assets/Chess1.png">
      <img id="chess2" src="../assets/Chess2.png">

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

      <div id="box3">
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
  position: absolute;
  width: 1600px;
  height: 1040px;
  left: 0px;
  top: 615px;
  background: #EDEDF2;
}
#chess1 {
 position: absolute;
 height: 267.17490145529985px;
 width: 113.27063209377528px;
 left: 1436.8583984375px;
 top: 104.300537109375px;
 border-radius: 0px;

 background: rgba( 255, 255, 255, 0 );
}

#chess2 {
  position: absolute;
  height: 247.28165346559211px;
  width: 119.18116349536974px;
  left: 150px;
  top: 848.837646484375px;
  border-radius: 0px;
  background: rgba( 255, 255, 255, 0 );
}

#box1{
  position: absolute;
  width: 380px;
  height: 530px;
  left: 410px;
  top: 44px;
  background: #F5F8FC;
  border-radius: 20px;
}
#box2{
  position: absolute;
  height: 346px;
  width: 380px;
  left: 810px;
  top: 44px;
  border-radius: 20px;
  background: #F5F8FC;
}
#box3{
  position: absolute;
  width: 380px;
  height: 346px;
  left: 410px;
  top: 612px;
  background: #F5F8FC;
  border-radius: 20px;
}
#box4{
  position: absolute;
  width: 380px;
  height: 534px;
  left: 810px;
  top: 424px;
  background: #F5F8FC;
  border-radius: 20px;
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
