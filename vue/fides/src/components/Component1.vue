<template>
    <div id="component1">
      <img id="component1-main-top1" src="../assets/component1/main_1.jpg">
      <img id="component1-main-top2" src="../assets/component1/main_2.jpg">
      <img id="component1-main-top3" src="../assets/component1/main_3.jpg">
      <img id="component1-main-top4" src="../assets/component1/main_4.jpg">
      <img id="component1-main-top5" src="../assets/component1/main_5.jpg">
      <h1 id="component1_title">World's first web3 venture capital & guild</h1>
      <p id="component1_contents" ref="component1">Fides is <span class="most">innovative venture capital</span> for the cryptocurrency managed by the <span class="most">investor community's</span> collective intelligence </p>
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

#component1-main-top1{
  position: absolute;
  width: 2560px;
  height: 110px;
  left: 0px;
  top: 85px;
}
#component1-main-top2{
  position: absolute;
  width: 2560px;
  height: 220px;
  left: 0px;
  top: 85px;
}
#component1-main-top3{
  position: absolute;
  width: 2560px;
  height: 110px;
  left: 0px;
  top: 305px;
}
#component1-main-top4{
  position: absolute;
  width: 2560px;
  height: 110px;
  left: 0px;
  top: 415px;
}
#component1-main-top2{
  position: absolute;
  width: 2560px;
  height: 110px;
  left: 0px;
  top: 195px;
}
#component1-main-top5{
  position: absolute;
  width: 2560px;
  height: 110px;
  left: 0px;
  top: 525px;
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
