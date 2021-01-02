import React from 'react';
import './App.css';
import LoginCustumer from "./components/login/loginCustomer.js";
import ReactDOM from "react-dom";
import { BrowserRouter, Route, Switch, Redirect } from "react-router-dom";


class App extends React.Component{
  render() {
    return(
        <div>
            <LoginCustumer></LoginCustumer>
        </div>
    );
  }
}
export default App;
