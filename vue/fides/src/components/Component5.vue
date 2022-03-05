<template>
    <div id="component5">
      <h1 id="component5-text-title">The FIdes Blog</h1>
      <p id="component5-text-body">Find the better opportunities in Fides Blog
      </p>

      <div id="component5-blog1-box">
      <a href="https://medium.com/@fidesmeta/01-fides-meta-venture-a36172c24675">
      <img id="component5-blog1-upper" src="../assets/component5/blog1.png">
      <p id="component5-blog1-text">01.Fides meta venture</p>
      <p id="component5-blog1-text2">Fides is a venture capital organization based....</p>
      <p id="component5-blog1-date">February 26</p>
      </a>
      </div>

      <div id="component5-blog2-box">
      <a href="https://medium.com/@fidesmeta/02-idos-nft-f63c5ec23c30">
      <img id="component5-blog2-upper" src="../assets/component5/blog2.png">
      <p id="component5-blog2-text">02.IDOs & NFT</p>
      <p id="component5-blog2-text2">Regarding IDO, the necessary information wil....</p>
      <p id="component5-blog2-date">February 26</p>
      </a>
      </div>

      <div id="component5-blog3-box">
      <a href="https://medium.com/@fidesmeta/03-de-fi-platform-c37411ddde1">
      <img id="component5-blog3-upper" src="../assets/component5/blog3.png">
      <p id="component5-blog3-text">03.De-fi platform</p>
      <p id="component5-blog3-text2">De-fi platform for the transactions, mining....</p>
      <p id="component5-blog3-date">February 26</p>
      </a>
      </div>
    </div>
</template>

<script>
export default {
  name: 'component5',
  components: {
  }
}
</script>

<style>
#component5{
  position: absolute;
  width: 1600px;
  height: 572px;
  left: -800px;
  top: 2770px;
  background: #FFFFFF;
}
#component5-text-title{
  position: absolute;
  width: 250px;
  height: 30px;
  left:695px;
  top: 52px;
  font-family: Roboto;
  font-style: normal;
  font-weight: bold;
  font-size: 30px;
  line-height: 30px;
}
#component5-text-body{
  position: absolute;
  width: 310px;
  height: 18px;
  left: 645px;
  top: 98px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #606060;
}
#component5-blog1-upper{
  position: absolute;
  width: 380px;
  height: 220px;
  left: 0px;
  top: 0px;
  background: #FFFFFF;
  border-radius: 20px 20px 0px 0px;
}
#component5-blog1-box{
  position: absolute;
  width: 380px;
  height: 338px;
  left: 210px;
  top: 156px;
  background: #FFFFFF;
  box-shadow: 0px 0px 16px rgba(0, 0, 0, 0.2);
  border-radius: 20px;
}
#component5-blog1-box:hover{
 box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.4);
 }
#component5-blog2-box{
  position: absolute;
  width: 380px;
  height: 338px;
  left: 610px;
  top: 156px;
  background: #FFFFFF;
  box-shadow: 0px 0px 16px rgba(0, 0, 0, 0.2);
  border-radius: 20px;
}
#component5-blog2-box:hover{
 box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.4);
 }
#component5-blog3-box{
  position:absolute;
  width: 380px;
  height: 338px;
  left: 1010px;
  top: 156px;
  background: #FFFFFF;
  box-shadow: 0px 0px 16px rgba(0, 0, 0, 0.2);
  border-radius: 20px;
}
#component5-blog3-box:hover{
  box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.4);
 }
#component5-blog2-upper{
  position: absolute;
  width: 380px;
  height: 220px;
  left: 0px;
  top: 0px;
  background: #FFFFFF;
  border-radius: 20px 20px 0px 0px;
}
#component5-blog3-upper{
  position: absolute;
  width: 380px;
  height: 220px;
  left: 0px;
  top: 0px;
  background: #FFFFFF;
  border-radius: 20px 20px 0px 0px;
}
#component5-blog1-text{
  position: absolute;
  width: 340px;
  height: 40px;
  left: 20px;
  top: 220px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #000000;
  text-align:left;
}
#component5-blog1-text2{
  position: absolute;
  width: 340px;
  height: 20px;
  left: 20px;
  top: 250px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* identical to box height, or 125% */
  color: #7D7D7D;
}
#component5-blog2-text{
  position: absolute;
  width: 340px;
  height: 40px;
  left: 20px;
  top: 220px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #000000;
  text-align:left;
}
#component5-blog2-text2{
  position: absolute;
  width: 340px;
  height: 20px;
  left: 20px;
  top: 250px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  color: #7D7D7D;
}
#component5-blog3-text{
  position: absolute;
  width: 340px;
  height: 40px;
  left: 20px;
  top: 220px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* or 125% */
  color: #000000;
  text-align:left;
}
#component5-blog3-text2{
  position: absolute;
  width: 340px;
  height: 20px;
  left: 20px;
  top: 250px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  color: #7D7D7D;
}
#component5-blog1-date{
  position: absolute;
  width: 100px;
  height: 20px;
  left: 20px;
  top: 284px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* identical to box height, or 125% */
  color: #8E8E8E;
  text-align:left;
}
#component5-blog2-date{
  position: absolute;
  width: 340px;
  height: 20px;
  left: 20px;
  top: 284px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* identical to box height, or 125% */
  color: #8E8E8E;
  text-align:left;
}
#component5-blog3-date{
  position: absolute;
  width: 340px;
  height: 20px;
  left: 20px;
  top: 284px;

  font-family: Roboto;
  font-style: normal;
  font-weight: 500;
  font-size: 16px;
  line-height: 20px;
  /* identical to box height, or 125% */
  color: #8E8E8E;
  text-align:left;
}
</style>
