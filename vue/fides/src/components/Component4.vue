<template>
    <div id="component4">
      <img id="component4-background" src="../assets/component4/background2.png">
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
  width: 2560px;
  left: -1280px;
  text-align: center;
}

#component4-background {
  position:absolute;
  width: 2560px;
  height: 445px;
  left: 410px;
  top: 2290px;

}
#component4-chess{
  position: absolute;
  height: 200px;
  width: 140px;
  left: 1860px;
  top: 2190px;
  border-radius: 0px;
}
#component4-wrapper{
  position: absolute;
  width: 900px;
  height: 200px;
  left: 830px;
  top: 2406px;
  background: rgba(255, 255, 255, 0.2);
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
  margin-top:30px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 30px;
  line-height: 36px;
}
#component4-text-title{
  font-family: Roboto;
  font-style: normal;
  color: #0F8D7C;
  font-weight: 900;
  font-size: 30px;
}
#component4-text-content{

}
</style>
