const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;
const eurekaHelper = require('./eureka-helper');

app.listen(PORT, () => {
  console.log("user-service on 3000");
})

app.get('/user', (req, res) => {
 res.json([
   {
     "name":"quang",
     "age":21
   },
   {
    "name":"tuấn",
    "age":21
  },
  {
    "name":"duy",
    "age":21
  }
])
})
eurekaHelper.registerWithEureka('user-service', PORT);
