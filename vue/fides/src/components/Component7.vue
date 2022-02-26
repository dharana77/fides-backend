<template>
    <div id="component7">
      <img id="component7-whitepaper-img" src="../assets/component7/whitepaper.png">
      <p id="component7-titles">For more information<br>
       <span id="component7-contents">Please refer to our whitepaper.<br>
       In the whitepaper, there is more detailed<br>information about our projects.</span></p>

      <div id="component7-ido" class="under">
        <img id="component7-icon1" src="../assets/component7/icon1.png">
        <h5 id="component7-icon1-title">IDOs & NFT</h5>
        <h5 id="component7-icon1-page">p.2</h5>
      </div>

      <div id="component7-teardao">
        <img id="component7-icon2" src="../assets/component7/icon2.png">
        <h5 id="component7-icon2-title">De-fi platform</h5>
        <h5 id="component7-icon2-page">p.3</h5>
      </div>
      <div id="component7-alphabeta">
        <img class="icons" id="component7-icon3" src="../assets/component7/icon3.png">
        <h5 id="component7-icon3-title">Community system</h5>
        <h5 id="component7-icon3-page">p.4</h5>
      </div>

      <div id="component7-bounty">
        <img id="component7-icon4" src="../assets/component7/icon4.png">
        <h5 id="component7-icon4-title">Research and Information System</h5>
        <h5 id="component7-icon4-page">p.6</h5>
      </div>

      <div id="component7-researchCenter">
        <img id="component7-icon5" src="../assets/component7/icon5.png">
        <h5 id="component7-icon5-title">1/N investment</h5>
        <h5 id="component7-icon5-page">p.7</h5>
      </div>

      <div id="component7-n1system">
        <img id="component7-icon6" src="../assets/component7/icon6.png">
        <h5 id="component7-icon6-title">Information guild & Marketplace</h5>
        <h5 id="component7-icon6-page">p.9</h5>
      </div>

      <div id="component7-dao">
        <img id="component7-icon7" src="../assets/component7/icon7.png">
        <h5 id="component7-icon7-title">Formation of expandable DAO</h5>
        <h5 id="component7-icon7-page">p.11</h5>
      </div>
    </div>
</template>

<script>
import App from '../App.vue'
export default {
  name: 'component7',
  components: {
    App
  }
}
</script>

<style>
.under{
  background-image: linear-gradient(transparent 60%, #F8CD07 40%);
}
#system{
  background-image: linear-gradient(transparent calc(100% - 3px), #000 3px);
  background-repeat: no-repeat;
  background-size: 0% 100%;
  transition: background-size 0.8s;
}
#system:hover{
  background-size: 100% 100%;
}
#component7{
  position: absolute;
  height: 530px;
  left: -800px;
  top: 3867px;
  background: #FFFFFF;
}
#component7-whitepaper-img{
  top: 88px;
  position: absolute;
  width: 466px;
  height: 466px;
  left: 192px;
  top: 60px;
}

#component7-titles{
  position: absolute;
  width: 600px;
  height: 140px;
  left: 810px;
  top: 54px;
  font-family: Roboto;
  font-weight: bold;
  font-size: 30px;
  line-height: 38px;
  /* or 120% */
  color: #3B7E74;
  text-align:left;
}
#component7-contents{
  font-family: Roboto;
  font-style: normal;
  font-size: 28px;
  font-weight: 500;
  line-height: 34px;
  /* or 120% */
  color: #333333;
  text-align:left;
}
#component7-icon1{
  position: absolute;
  height: 18px;
  width: 18px;
  left: 810px;
  top: 270px;
  border-radius: 0px;
  display:inline;
}
#component7-icon1-title{
  position: absolute;
  width: 700px;
  height: 19px;
  left: 840px;
  top: 232px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 20px;
  color: #333333;
  display: inline;
}
#component7-icon1-page{
  position: absolute;
  width: 30px;
  height: 19px;
  left: 1260px;
  top: 234px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  /* or 120% */
  color: #333333;
}
#component7-icon2{
  position: absolute;
  height: 18px;
  width: 18px;
  left: 810px;
  top: 302px;
  border-radius: 0px;
}
#component7-icon2-title{
  position: absolute;
  width: 500px;
  height: 19px;
  left: 840px;
  top: 266px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 20px;
  /* or 120% */
  color: #333333;
}
#component7-icon2-page{
  position: absolute;
  width: 30px;
  height: 19px;
  left: 1258px;
  top: 268px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  /* or 120% */
  text-align: right;
  color:#333333;
}
#component7-icon3{
  position: absolute;
  height: 18px;
  width: 18px;
  left: 810px;
  top: 336px;
  border-radius: 0px;
}

#component7-icon3-title{
  position: absolute;
  width: 500px;
  height: 19px;
  left: 840px;
  top: 300px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 20px;
  /* or 120% */
  color: #333333;
}
#component7-icon3-page{
  position: absolute;
  width: 30px;
  height: 19px;
  left: 1258px;
  top: 302px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  /* or 120% */
  text-align: right;
  color: #333333;
}
#component7-icon4{
  position: absolute;
  height: 18px;
  width: 18px;
  left: 810px;
  top: 370px;
  border-radius: 0px;
}
#component7-icon4-title{
  position: absolute;
  width: 500px;
  height: 19px;
  left: 840px;
  top: 334px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 20px;
  /* or 120% */
  color: #333333;
}
#component7-icon4-page{
  position: absolute;
  width: 30px;
  height: 19px;
  left: 1258px;
  top: 336px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  /* or 120% */
  text-align: right;
  color: #333333;
}
#component7-icon5{
  position: absolute;
  height: 18px;
  width: 18px;
  left: 810px;
  top: 380px;
  border-radius: 0px;
}

#component7-icon5-title{
  position: absolute;
  width: 272px;
  height: 19px;
  left: 838px;
  top: 368px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 20px;
  /* or 120% */
  color: #333333;
}
#component7-icon5-page{
  position: absolute;
  width: 30px;
  height: 19px;
  left: 1258px;
  top: 370px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  /* or 120% */
  text-align: right;
  color: #333333;
}
#component7-icon5{
  position: absolute;
  height: 18px;
  width: 18px;
  left: 810px;
  top: 404px;
  border-radius: 0px;
}
#component7-icon6{
   position: absolute;
   height: 18px;
   width: 18px;
   left: 810px;
   top: 440px;
   border-radius: 0px;
}
#component7-icon6-title{
  position: absolute;
  width: 500px;
  height: 19px;
  left: 840px;
  top: 404px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 20px;
  /* or 120% */
  color: #333333;
}
#component7-icon6-page{
  position: absolute;
  width: 30px;
  height: 19px;
  left: 1258px;
  top: 404px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  /* or 120% */
  text-align: right;
  color: #333333;
}

#component7-icon7{
   position: absolute;
   height: 18px;
   width: 18px;
   left: 810px;
   top: 476px;
   border-radius: 0px;
}
#component7-icon7-title{
  position: absolute;
  width: 500px;
  height: 19px;
  left: 840px;
  top: 440px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  /* or 120% */
  color: #333333;
}

#component7-icon7-page{
  position: absolute;
  width: 30px;
  height: 19px;
  left: 1258px;
  top: 440px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
}
</style>
