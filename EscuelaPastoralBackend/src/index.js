import express from 'express';

const app = express();
app.use(express.json());

app.listen(3000, () => {
    console.log('listening on port 3000');
})

app.get("/ping", (req, res)=>{
    res.send("pong")
})