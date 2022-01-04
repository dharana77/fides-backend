<template>
    <div id="component8">
      <img id="getstart" src="../assets/start/back1.png">
      <div id="content-wrapper">
        <h3 id="start-title">Get started immediately</h3>
        <p id="start-explain">Connect your crypto wallet to start our application immediately
           No registration needed.</p>
       <div id="connectors">
         <img id="connect" src="../assets/start/connect.png">
         <div id="connect_content">
           <h4 id="connect_text">Connect Wallet</h4>
         </div>
       </div>
      </div>
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
  position: relative;
  width: 100%;
  background-color: #FFFFFF;
  text-align: center;
}
#getstart{
  width: 100%;
  height: 300px;
}
#content-wrapper{
  position: absolute;
  background: rgba( 255, 255, 255, 0 );
  top: 25%;
  left: 30%;
  text-align: center;
}
#connectos{
  position: relative;
  background: rgba( 255, 255, 255, 0 );
  top: 25%;
  left: 30%;
}
#connect_content{
  position: absolute;
  top: 60%;
  left: 36%;
}
#start-title{
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 30px;
  line-height: 30px;
  /* identical to box height, or 100% */
  text-align: center;
  color: #FFFFFF;
}
#start-explain{
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  text-align: center;
  color: #FFFFFF;
}
#connect{
  height: 48px;
  width: 210px;
  border-radius: 30px;
}
#connect_text{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 24px;
  line-height: 20px;
  color: #FFFFFF;
  text-align:center;
}
</style>
