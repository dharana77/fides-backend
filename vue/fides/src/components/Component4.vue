<template>
    <div id="component4">
      <img id="component4-background" src="../assets/component4/background.png">
      <img id="component4-chess" src="../assets/component4/chess.png">
      <div id= "component4-wrapper">
        <div id="component4-textbox">
          <p class="component4-text-style"><span id="component4-text-title">Why Fides?</span><br>
          <span id="component4-text-text">Fides support the open community through<br> decentralization of venture capital, and we will distribute<br> the gain back to the community.</span></p>
        </div>
      </div>
    </div>
</template>

<script>
export default {
  name: 'component4',
  components: {
  }
}
</script>

<style>
#component4{
  position: absolute;
  width: 1600px;
  left: -800px;
  text-align: center;
}

#component4-background {
  position:absolute;
  width: 1600px;
  height: 458px;
  left: 0px;
  top: 2290px;
}
#component4-chess{
  position: absolute;
  height: 200px;
  width: 140px;
  left: 1360px;
  top: 2190px;
  border-radius: 0px;
}
#component4-wrapper{
  position: absolute;
  width: 900px;
  height: 200px;
  left: 350px;
  top: 2406px;
  background: rgba(255, 255, 255, 0.4);
  backdrop-filter: blur(20px);
  /* Note: backdrop-filter has minimal browser support */
  border-radius: 24px;
}
#component4-textbox{
  position: absolute;
  width: 780px;
  top: 4px;
  left: 60px;
  height: 142px;
  text-align:left;
}
.component4-text-style{
  position: absolute;
  font-family: Roboto;
  font-size: 28px;
  line-height: 34px;
  font-weight: 500;
  color: #484848;
}
#component4-text-title{
  text-align: center;
  color: #0F8D7C;
  text-shadow: 0px 0px 30px rgba(0, 0, 0, 0.25);
  font-weight: 1000;
}
#component4-text-content{

}
</style>
