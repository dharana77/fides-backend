<template>
    <div id="component8">
      <img id="component8-background" src="../assets/component8/background2.png">
      <h3 id="component8-title">Get started immediately</h3>
      <p id="component8-explain">Please join our community and Get more information about
                                 Fides meta venture!</p>
      <a href="https://fidesmetaventure.gitbook.io/whitepaper/">
      <img id="component8-connect-img" src="../assets/component8/connect.png">
      <h4 id="component8-connect-text">Read More</h4>
      </a>
    </div>
</template>

<script>
export default {
  name: 'component8',
  components: {
  }
}
</script>

<style>
#component8{
  position: absolute;
  width: 2560px;
  height: 300px;
  left: -1280px;
  top: 4430px;
  background-color: #FFFFFF;
  text-align: center;
}
#component8-background{
  position: absolute;
  width: 2560px;
  height: 300px;
  left: 0px;
}
#component8-title{
  position: absolute;
  width: 343px;
  height: 30px;
  left: 1104px;
  top: 50px;

  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 30px;
  line-height: 30px;
  /* identical to box height, or 100% */

  text-align: center;

  color: #FFFFFF;
}
#component8-explain{
  position: absolute;
  width: 450px;
  height: 34px;
  left: 1060px;
  top: 116px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */

  text-align: center;
  color: #FFFFFF;
}
#component8-connect-img{
  position: absolute;
  width: 210px;
  height: 48px;
  left: 1175px;
  top: 198px;
  background: #E9863B;
  border-radius: 30px;
}
#component8-connect-text{
  position: absolute;
  width: 168px;
  height: 18px;
  left: 1196px;
  top: 180px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 1500;
  font-size: 24px;
  line-height: 20px;
  /* or 83% */
  text-align: center;
  color: #FFFFFF;
}
</style>
