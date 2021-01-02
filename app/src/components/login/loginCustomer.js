import React from 'react';
import axiosConfig from "axios"


class LoginCustomer extends React.Component{
    constructor(prop) {
        super(prop);
        this.state={
           "username" : null,
           "password" : null
        }
    }

    handleChange = e => {
        e.preventDefault();
        const {name, value} = e.target;
        this.setState({[name]: value}, () => console.log(this.state));
    }


    handleSubmit = e => {
        e.preventDefault();
        axiosConfig.post("http://localhost:8080/login/customer",this.state)
            .then(response => {
                this.setState(response, ()=> console.log(response));
            })
    }

    render(){
        return(
            <div className= "container">
                <div className= "header"> Welcome login Customer! </div>
                <div className= "form">
                    <div className= "form-group">
                        <label htmlFor="username">Username</label>
                        <input type= "text" name="username" placeholder="User Name" onChange={this.handleChange}/>
                    </div>
                    <div className= "form-group">
                        <label htmlFor="password">Password</label>
                        <input type= "password" name="password" placeholder="Password" onChange={this.handleChange}/>
                    </div>
                </div>
                <div className = "submit">
                    <button type="submit" className="submitButton" onClick={this.handleSubmit}>
                        Login
                    </button>
                </div>
            </div>
        )
    }
}
export default LoginCustomer;