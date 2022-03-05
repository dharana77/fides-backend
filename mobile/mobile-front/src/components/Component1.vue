<template>
    <div id="component1">
      <div id="component1-title">The most progressive investment Community</div>
      <div id="component1-contents">Fides is innovative venture capital for the cryptocurrency managed by the investor community's collective intelligence </div>
      <img id="component1-img" src="../assets/component1-main.png">
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
  width: 100%;
  left: -187.5px;
}
#component1-title{
  position: absolute;
  width: 335px;
  height: 78px;
  left: 20px;
  top: 90px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 31px;
  line-height: 44px;
  /* or 142% */
  color: #000000;
}
#component1-contents{
  position: absolute;
  width: 335px;
  height: 72px;
  left: 20px;
  top: 188px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 18px;
  line-height: 24px;
  /* or 133% */
  color: #000000;
}
#component1-img{
 position: absolute;
 width: 335px;
 height: 492px;
 left: 20px;
 top: 280px;
 background: #fcfcfc;
 box-sizing: border-box;
 border-radius: 20px;
}
</style>
