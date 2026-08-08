import * as http from 'http';

export class Server {
  private httpServer!: http.Server;

  constructor() {
    this.httpServer = http.createServer();
    this.httpServer.on("request", (req, res) => {
      this.handleRequest(req, res);
    });
  }

private handleRequest(req: http.IncomingMessage, res: http.ServerResponse): void {
    const url = req.url || '/';

    if (url === '/') {
      res.writeHead(200, {
        'Content-Type': 'text/plain; charset=utf-8',
        'Cache-Control': 'no-store',
        'X-Smart-Code': 'yes',
      });
      res.end('Hello, World!\nhello from the server to kareem\nANAS\n');
      return;
    }

}

public start(port: number,callback: () => void): void {
    // bind to all interfaces so remote/workspace port forwarding can reach the server
    this.httpServer.listen(port, '0.0.0.0', () => {
      callback();
      console.log(`Server is running on http://localhost:${port}`);
    });
  }

 


  public getServer(): http.Server {
    return this.httpServer;
  }
}

export function serve(): Server {
  return new Server();
}
