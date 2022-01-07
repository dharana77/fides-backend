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
  position: absolute;
  width: 1600px;
  height: 300px;
  left: 0px;
  top: 4397px;
  background-color: #FFFFFF;
  text-align: center;
}
#getstart{
  width: 100%;
  height: 100%;
}
#content-wrapper{
  position: absolute;
  background: rgba( 255, 255, 255, 0 );
  top: 10%;
  left: 30%;
  right:30%;
}
#connectors{
  position: relative;
  background: rgba( 255, 255, 255, 0 );
  top: 50%;
}

#connect_content{
  position: absolute;
  top: 60%;
  left: 30%;
  right:30%;
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
  position: absolute;
  width: 210px;
  height: 48px;
  top: 15px;
  left: 215px;
  background: #E9863B;
  border-radius: 30px;
}
#connect_content{
  position: absolute;
  background: rgba( 255, 255, 255, 0 );
  width: 40%;
  top: -28%;
}
#connect_text{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 130%;
  line-height: 20px;
  color: white;
  text-align:center;
}
</style>
