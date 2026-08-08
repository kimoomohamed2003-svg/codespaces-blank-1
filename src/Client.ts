import fetch from "node-fetch"; 

export class Client {
  private baseUrl: string;

  constructor() {
    this.baseUrl = "https://api.github.com"; 
  }   
 
public init() {
    const request = fetch(this.baseUrl, {
      method: "GET",
      headers: {}
    });
    request.then((response: any) => {
      response.json().then((data: any) => console.log(data));
    });  
  }

}  
