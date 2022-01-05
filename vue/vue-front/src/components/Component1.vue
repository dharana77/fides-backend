<template>
    <div id="layer2">
      <img id="layer_img" src="../assets/component1/layer_2x.png">
      <div id="layer_text">
        <h1 id="layer_title">The most progressive investment guild</h1>
        <p id="layer_contents">Fides is The <span class="most">Most</span> progressive<br>
        <span class="guild"> Investment Guild,</span> We seek more profits<br>
        with less capital</p>
      </div>
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
#layer2 img{
  width: 100%;
  height: 595px;
  top: 42px;
  background-color: #FFFFFF;
  text-align: center;
}
#layer2{
  position: relative;
}
#layer_text{
  position: absolute;
  top: 15%;
  left: 10%;
}
#layer_title{
  width: 536px;
  height: 108px;
  text-align: left;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 54px;
  line-height: 60px;
  /* or 111% */
  color: #000000;
}
#layer_contents{
  width: 536px;
  height: 108px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
  color: #000000;
  text-align: left;
}
.most{
  color:#1CAE9A;
}
.guild{
  color:#E4297E;
}
</style>
