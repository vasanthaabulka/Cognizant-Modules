console.log("Welcome to the Community Portal");

window.onload = () => {
  alert("Page loaded successfully!");
};

function showContent(section) {
  const content = document.getElementById('content');
  let html = "";

  switch (section) {
    case 'home':
      html = `
        <h2>Welcome to Our Community Portal</h2>
        <p>This is your one-stop destination for upcoming events, local news, and ways to stay involved.</p>
      `;
      break;
    case 'events':
      html = `
        <h2>Upcoming Events</h2>
        <ul>
          <li>🏃‍♂️ Fun Run – June 10, 2025</li>
          <li>🎨 Art Workshop – June 15, 2025</li>
          <li>🎶 Music Festival – June 20, 2025</li>
        </ul>
      `;
      break;
    case 'news':
      html = `
        <h2>Community News</h2>
        <p>📰 New park opening next week!</p>
        <p>📚 Summer reading programs available at the local library.</p>
      `;
      break;
    case 'contact':
      html = `
        <h2>Contact Us</h2>
        <p>Email: info@communityportal.com</p>
        <p>Phone: +91 98765 43210</p>
        <p>Location: Kompally, Hyderabad</p>
      `;
      break;
  }

  content.innerHTML = html;
}
