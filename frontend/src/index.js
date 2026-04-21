const express = require("express");

const app = express();
const PORT = process.env.PORT || 3000;

app.use(express.json());

app.get("/", (req, res) => {
  res.status(200).json({
    service: "frontend",
    message: "Frontend service is running successfully"
  });
});

app.get("/health", (req, res) => {
  res.status(200).json({
    status: "UP",
    service: "frontend"
  });
});

app.listen(PORT, () => {
  console.log(`Frontend service is running on port ${PORT}`);
});
