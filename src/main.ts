import { serve } from './Server.js';
import { Client } from './Client.js';

// run server if you want
// const server = serve();
// server.start(5077, () => {
//   console.log('Server running on port 5077');
// });

const client = new Client();
client.init();
