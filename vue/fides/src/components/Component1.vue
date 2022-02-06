<template>
    <div id="component1">
      <img id="background_img" src="../assets/component1/background1.png">
      <h1 id="component1_title">World's first web3 venture capital & guild</h1>
      <p id="component1_contents">Fides is <span class="most">innovative venture capital</span> for the cryptocurrency managed by the <span class="most">investor community's</span> collective intelligence </p>
    </div>
</template>

<script>
export default {
  name: 'component1',
  components: {
  }
}
</script>

<style>
#component1{
  position: absolute;
  width: 2560px;
  left: -1280px;
}
#background_img{
  position: absolute;
  width: 2560px;
  height: 515px;
  left: 0px;
  top: 85px;
  background: #FFFFFF;
}

#component1_title{
  position: absolute;
  width: 536px;
  height: 108px;
  left: 650px;
  top: 190px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 1200;
  font-size: 54px;
  line-height: 60px;
  /* or 111% */
  color: #000000;
  text-align:left;

}
#component1_contents{
  position: absolute;
  width: 630px;
  height: 108px;
  left: 650px;
  top: 330px;
  font-family: Roboto;
  font-weight: medium;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
  color: #000000;
  text-align:left;
}
#layer_contents{
  margin: 0% 0% 0% 0%;
  width: 40%;
  height: 108px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 2vw;
  line-height: 36px;
  /* or 120% */
  color: #000000;
  text-align: left;
}
.most{
  color:#0F8D7C;
  font-weight: bold;
}
</style>
