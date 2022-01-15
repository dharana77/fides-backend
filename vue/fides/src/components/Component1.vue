<template>
    <div id="component1">
      <img id="background_img" src="../assets/component1/background.png">
      <h1 id="component1_title">The most progressive investment guild</h1>
      <p id="component1_contents">Fides is The <span class="most">Most</span> progressive<br>
      <span class="guild"> Investment Guild,</span> We seek more profits<br>
      with less capital</p>
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
  width: 100%;
}
#background_img{
  position: absolute;
  width: 1600px;
  height: 530px;
  left: 0px;
  top: 85px;
  background: #FFFFFF;
}

#component1_title{
  position: absolute;
  width: 536px;
  height: 108px;
  left: 210px;
  top: 178px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 54px;
  line-height: 60px;
  /* or 111% */
  color: #000000;
  text-align:left;

}
#component1_contents{
  position: absolute;
  width: 536px;
  height: 108px;
  left: 210px;
  top: 316px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
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
  color:#1CAE9A;
}
.guild{
  color:#E4297E;
}
</style>
