<template>
    <div id="component8">
      <img id="component8-background" src="../assets/component8/background1.png">
      <h3 id="component8-title">Get started immediately</h3>
      <p id="component8-explain">Connect your crypto wallet to start our application immediately
         No registration needed.</p>
      <img id="component8-connect-img" src="../assets/component8/connect.png">
      <h4 id="component8-connect_text">Connect Wallet</h4>
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
  width: 1600px;
  height: 300px;
  left: 0px;
  top: 4397px;
  background-color: #FFFFFF;
  text-align: center;
}
#component8-background{
  position: absolute;
  width: 1600px;
  height: 300px;
  left: 0px;
}
#component8-title{
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
  top: 15px;
  left: 215px;
  background: #E9863B;
  border-radius: 30px;
}
#component8-connect-text{
  position: absolute;
  background: rgba( 255, 255, 255, 0 );
  width: 40%;
  top: -28%;
}
</style>
