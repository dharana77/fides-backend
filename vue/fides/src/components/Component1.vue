<template>
    <div id="component1">
      <img id="component1-main-top" src="../assets/component1/main_img.png">
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
  height: 640px;
  left: 0px;
  top: 85px;
  background: #FFFFFF;
}
#component1-main-top{
  position: absolute;
  width: 2560px;
  height: 550px;
  left: 0px;
  top: 85px;
}

#component1_title{
  position: absolute;
  width: 560px;
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

div> #component1_title {
  animation-duration: 3.2s;
  animation-name: slidein_title;
}

div> #component1_contents{
  animation-duration: 4.2s;
  animation-name: slidein_contents;
}

@keyframes slidein_title {
  from {
    margin-left: 10%;
    width: 560px;
  }
  to {
    margin-left: 0%;
    width: 560px;
  }
}
@keyframes slidein_contents {
  from {
    margin-left: 10%;
    width: 630px;
  }
  to {
    margin-left: 0%;
    width: 630px;
  }
}
</style>
