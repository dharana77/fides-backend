<template>
    <div id="component3">
          <div id="component3-explain-box">
            <span class="fides-explain-title">The missions of Fides</span><br>
            <span class="fides-explain-text">Fides is <span class="text-inline">Decentralization of Venture</span> Capital, and distribution of the gain back to the project participant
The more specific development plan is followed.
</span>
          </div>

          <div id="component3-explain-contents1">
            <h1 class="contents1-title" id="component3-box1-title">Beta Profit</h1>
            <p class="contents1-text" id="component3-box1-text">Beta profit is a part of the index fund system. Fides aims to follow at least the market average gain, and we will contrive the ways of growth to meet the mission statement.
Through this, we can prevent the risk of the bear market, and expect continuous growth.
</p>
            <h3 class="detail" id="component3-box1-detail">View Detail</h3>
            <img id="component3-line1">
          </div>

          <div id="component3-explain-contents2">
            <h1 class="contents2-title" id="component3-box2-title">1/N Investment</h1>
            <p class="contents2-text" id="component3-box2-text">You can purchase the part of the asset, not the whole.
Through this, you will have an autonomous marketplace, and the owners will have opportunities to buy and sell their ownership.
            </p>
            <h3 class="detail" id="component3-box2-detail">View Detail</h3>
            <img id="component3-line2">
          </div>

          <div id="component3-explain-contents3">
            <h1 class="contents3-title" id="component3-box3-title">Project launch & IDO</h1>
            <p class="contents3-text" id="component3-box3-text">Initiation of users' projects and participation in other projects are possible.
Depending on the conditions of the investment, you will have the right to participate in the project as a beta tester.
            </p>
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
  top: 1730px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
  color: #0F8D7C;
  text-align: center;
}

.text-inline{
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  color: #333333;
}
.fides-explain-title{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 36px;
  line-height: 50px;
  /* or 120% */
  color: #0F8D7C;
  text-align: center;
}
.fides-explain-text{
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  font-size: 30px;
  line-height: 36px;
  color: #606060;
  text-align: center;
}
#component3-explain-contents1{
 position: absolute;
 width: 380px;
 height: 300px;
 left: 210px;
 top: 1920px;
 background: #F9F9F9;
 border-radius: 20px;
 }
 #component3-explain-contents1:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 4px 12px;
 }
#component3-explain-contents2{
  position: absolute;
  width: 380px;
  height: 300px;
  left: 610px;
  top: 1920px;
  background: #F9F9F9;
  border-radius: 20px;
}
 #component3-explain-contents2:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 4px 12px;
 }
#component3-explain-contents3{
  position: absolute;
  width: 380px;
  height: 300px;
  left: 1010px;
  top: 1920px;
  background: #F9F9F9;
  border-radius: 20px;
}
#component3-explain-contents3:hover{
 box-shadow: rgba(0, 0, 0, 0.24) 0px 4px 12px;
 }
.contents1-title, .contents2-title, .contents3-title{
  font-family: Roboto;
  font-weight: 1000;
  font-size: 28px;
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
  margin: 0 0 0 0;
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
  top: 255px;
  background: #96BEB9;
}
#component3-line2{
 position: absolute;
 width: 340px;
 height: 1px;
 left: 20px;
 top: 255px;
 background: #96BEB9;
}
#component3-line3{
  position: absolute;
  width: 340px;
  height: 1px;
  left: 20px;
  top: 255px;
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
  top: 252px;
}
#component3-box1-title, #component3-box2-title, #component3-box3-title{
  position: absolute;
  text-align: left;
  left: 20px;
}
#component3-box1-text, #component3-box2-text, #component3-box3-text{
  position: absolute;
  width:340px;
  text-align: left;
  left: 20px;
  top: 90px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
}
</style>
