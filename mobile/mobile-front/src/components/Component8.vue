<template>
    <div id="component8">
       <img id="component8-background" src="../assets/component8-background.png"></img>
       <div id="component8-title">Get started immediately</div>
       <div id="component8-content">Please join our community<br>
                                    and Get more information about<br>
                                    Fides meta venture!
       </div>
       <div id="component8-button">
         <a href="https://fidesmetaventure.gitbook.io/whitepaper/">
          <div id="component8-button-text">Read more</div>
         </a>
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
  width: 375px;
  left: -187.5px;
}
#component8-background{
  position: absolute;
  width: 375px;
  height: 300px;
  left: 0px;
  top: 6903px;
}
#component8-title{
  position: absolute;
  width: 326px;
  height: 26px;
  left: 24px;
  top: 6969px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 26px;
  line-height: 26px;
  /* identical to box height, or 100% */
  text-align: center;
  color: #FFFFFF;
}
#component8-content{
  position: absolute;
  width: 345px;
  height: 56px;
  left: 15px;
  top: 7012px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  text-align: center;
  color: #FFFFFF;
}
#component8-button{
  position: absolute;
  width: 186px;
  height: 44px;
  left: 94px;
  top: 7093px;
  background: #E9863B;
  border-radius: 30px;
}
#component8-button-text{
  position: absolute;
  width: 168px;
  height: 18px;
  left: 9px;
  top: 13px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 20px;
  line-height: 20px;
  /* or 100% */
  text-align: center;
  color: #FFFFFF;
}
</style>