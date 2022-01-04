<template>
    <div id="component7">

      <div id= "text-content-wrapper">
        <img id="whitepaper-img" src="../assets/info/whitepaper.png">
        <div id="main-text">
          <span id="content-title" class="infoText">More Information</span><br>
          <span id="content-text" class="infoText">Our Fides is more advanced and<br>
           democratic investment guild for<br> capital increase</span>

          <div id="explains">
            <div id="explain1">
              <br>
              <img class="icons" id="icon1" src="../assets/info/icon1.png">
              <h5>1/n System</h5>
              <h5>p.2</h5>
            </div>
            <div id="explain2">
              <img class="icons" id="icon2" src="../assets/info/icon2.png">
              <h5>Tiered dao community</h5>
              <h5>p.3</h5>
            </div>
            <div id="explain3">
              <img class="icons" id="icon3" src="../assets/info/icon3.png">
              <h5>Subdao system</h5>
              <h5>p.4</h5>
            </div>
            <div id="explain4">
              <img class="icons" id="icon2" src="../assets/info/icon4.png">
              <h5>Lend system</h5>
              <h5>p.5</h5>
            </div>
            <div id="explain5">
              <img class="icons" id="icon2" src="../assets/info/icon5.png">
              <h5>Dao driven investment system</h5>
              <h5>p.6</h5>
            </div>
            <div id="explain6">
              <img class="icons" id="icon2" src="../assets/info/icon6.png">
              <h5>Bounty system</h5>
              <h5>p.7</h5>
            </div>
          </div>
        </div>
      </div>
    </div>
</template>

<script>
export default {
  name: 'component7',
  components: {
  }
}
</script>

<style>
#component7{
  position: relative;
  width: 100%;
  height: 530px;
  text-align: left;
}

#whitepaper-img{
  position: relative;
  width: 250.93px;
  height: 308.09px;
  top: 100px;
  left: 20.05%;
  box-sizing: border-box;
  background: rgba( 255, 255, 255, 0 );
}

#text-content-wrapper{
}

#main-text{
  position: relative;
   text-align: left;
   top: -200px;
   right: -700px;
}
.icons{
  background: white;
  height: 18px;
  width: 18px;
  border-radius: 0px;
}
#explains{
  text-align: left;
}
#explain1 img, #explain2 img, #explain3 img, #explain4 img, #explain5 img, #explain6 img{
  vertical-align: middle;
}
#explain1 h5, #explain2 h5, #explain3 h5, #explain4 h5, #explain5 h5, #explain6 h5{
  display: inline;
  vertical-align: middle;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
}

.infoText{
  font-family: Roboto;
  font-style: normal;
  font-weight: 900;
  font-size: 30px;
  line-height: 36px;
  /* or 120% */
}

#content-title{
  white-space: nowrap;
  color: #3B7E74;
}
</style>
