<template>
    <div id="component7">
      <div id= "content-wrapper">
        <img class="rect" id="rect1" src="../assets/info/whitepaper.png">
      </div>
      <div id= "text-content-wrapper">
        <div id="main-text">
          <h3 id="content-title">More Information</h3>
          <h3 id="content-text">Our Fides is more advanced and democratic investment guild for capital increase</h3>
        </div>
        <div id="explains">
          <div id="explain1">
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
#content-wrapper{
  background: white;
  text-align:left;
}
.rect{
  height: 290.0216990779262px;
  width: 236.2126530259646px;
  border-radius: 0px;
}

#rect1{
  position: absolute;
  width: 250.93px;
  height: 308.09px;
  box-sizing: border-box;
  text-align: left;
  background:white;
}

#rect2{
  position:relative;
  width: 246px;
  height: 238px;
  background: white;
}

#rect3{
  position: relative;
  height: 290.02173873590175px;
  width: 236.2126853260154px;
  border-radius: 0px;
  filter: blur(1px);
}

#rect4{
  position : relative;
  height: 290.02170998620716px;
  width: 236.21266191038254px;
  border-radius: 0px;
  filter: blur(2px);
}

#rect5{
  position: relative;
  width: 236.21px;
  height: 290.02px;
  background: #AFD0CA;
  filter: blur(4px);
}

#main-text{
  text-align: center;
}
.icons{
  background: white;
  height: 18px;
  width: 18px;
  border-radius: 0px;
}
#explains{
  text-align: center;
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

</style>
