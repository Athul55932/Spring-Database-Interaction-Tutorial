import { useState, useEffect } from "react";

function App() {
  const [fruits, setFruits] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/Fruits")
      .then((res) => res.json())
      .then((data) => setFruits(data))
      .catch((err) => console.error("Failed to fetch fruits:", err));
  }, []);

  return (
    <div style={{ padding: "2rem" ,justifyContent:"center" , alignItems:"center"}}>
      <h2>Fruit Pricing</h2>
      <ul>
        {fruits.map((fruit) => (
          <li key={fruit.id}>
            <span>{fruit.Fruit}</span>
            <span> - {fruit.Price}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
