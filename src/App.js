import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './Pages/home';
import Plan from './Pages/Plan';
import Navbar from './components/navbar';
import Footer from './components/footer';
import './index.css';

function App() {
  return (
    <Router>
      <div className="flex flex-col min-h-screen">
        <Navbar />
        <main className="flex-grow">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/plan" element={<Plan />} />
          </Routes>
        </main>
        <Footer />
      </div>
    </Router>
  );
}

export default App;