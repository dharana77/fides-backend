<template>
    <div id="component3">
          <div id="component3-explain-box">
            <span class="fides-explain-title">Why Fides?</span><br>
            <span class="fides-explain-text">Fides is the new wave for Investing crypto asset, We can
            devide the right and the seed money.<br>
            And then we share our profits with less capital</span>
          </div>

          <div id="component3-explain-contents1">
            <h1 class="contents1-title" id="component3-box1-title">1/N Investment</h1>
            <p class="contents1-text" id="component3-box1-text">Fides is the new wave for Investing crypto
            asset, Our strong point is our App can devide
            the right and the seed money of the investment ,
            At last we can share risk and advantage of
            investment.</p>
            <h3 class="detail" id="component3-box1-detail">View Detail</h3>
            <img id="component3-line1">
          </div>

          <div id="component3-explain-contents2">
            <h1 class="contents2-title" id="component3-box2-title">Tiered Dao System</h1>
            <p class="contents2-text" id="component3-box2-text">Fides is the new wave for Investing crypto
            asset, Our strong point is our App can devide
            the right and the seed money of the investment ,
            At last we can share risk and advantage of
            investment.</p>
            <h3 class="detail" id="component3-box2-detail">View Detail</h3>
            <img id="component3-line2">
          </div>

          <div id="component3-explain-contents3">
            <h1 class="contents3-title" id="component3-box3-title">Lend System</h1>
            <p class="contents3-text" id="component3-box3-text">Fides is the new wave for Investing crypto
            asset, Our strong point is our App can devide
            the right and the seed money of the investment ,
            At last we can share risk and advantage of
            investment.</p>
            <h3 class="detail" id="component3-box3-detail">View Detail</h3>
            <img id="component3-line3">
          </div>
    </div>
</template>

<script>
export default {
  name: 'component3',
  components: {
  }
}
</script>

<style>
#component3{
  position: absolute;
  width: 1600px;
  left: -800px;
}

#component3-explain-box{
  position: absolute;
  width: 780px;
  height: 142px;
  left: 410px;
  top: 1735px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
  color: #0F8D7C;
  text-align:left;
}

.fides-explain-title{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
  color: #1CAE9A;
}
.fides-explain-text{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 36px;
  color: black;
}

#component3-explain-contents1{
 position: absolute;
 width: 380px;
 height: 290px;
 left: 210px;
 top: 1917px;
 background: #F9F9F9;
 border-radius: 20px;
 }
#component3-explain-contents2{
  position: absolute;
  width: 380px;
  height: 290px;
  left: 610px;
  top: 1917px;

  background: #F9F9F9;
  border-radius: 20px;
}
#component3-explain-contents3{
  position: absolute;
  width: 380px;
  height: 290px;
  left: 1010px;
  top: 1917px;
  background: #F9F9F9;
  border-radius: 20px;
}
.contents1-title, .contents2-title, .contents3-title{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 26px;
  /* or 87% */
  color: #1CAE9A;
  margin: 10% 0 10% 0;
}
.contents1-text, .contents2-text, .contents3-text{
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
  text-align: left;
  margin: 0 0 10% 0;
}
.detail{
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 14px;
  /* or 87% */
  color: #96BEB9;
}
#component3-line1{
  position: absolute;
  width: 340px;
  height: 1px;
  left: 20px;
  top: 229px;
  background: #96BEB9;
}
#component3-line2{
 position: absolute;
 width: 340px;
 height: 1px;
 left: 20px;
 top: 229px;
 background: #96BEB9;
}
#component3-line3{
  position: absolute;
  width: 340px;
  height: 1px;
  left: 20px;
  top: 229px;
  background: #96BEB9;
}
#component3-box1-detail{
  position: absolute;
  left: 20px;
  top: 242px;
}
#component3-box1-detail, #component3-box2-detail, #component3-box3-detail{
  position: absolute;
  left: 20px;
  top: 242px;
}
#component3-box1-title, #component3-box2-title, #component3-box3-title{
  position: absolute;
  text-align: left;
  left: 20px;
}
#component3-box1-text, #component3-box2-text, #component3-box3-text{
  position: absolute;
  text-align: left;
  left: 20px;
  top: 109px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
}
</style>
