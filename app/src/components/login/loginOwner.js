import React from 'react';

class LoginCustumer extends React.Component{
    constructor(prop) {
        super(prop);
        this.state={
            userName: null,
            passWord: null
        }
    }

    render(){
        return(
            <div className= "container">
                <div className= "header"> Welcome login Owner! </div>
                <div className= "form">
                    <div className= "form-group">
                        <label htmlFor="username">Username</label>
                        <input type= "text" name="username" placeholder="User Name"/>
                    </div>
                    <div className= "form-group">
                        <label htmlFor="password">Password</label>
                        <input type= "text" name="password" placeholder="Password"/>
                    </div>
                </div>
                <div className = "submit">
                    <button type="submit" className="submitButton">
                        Login
                    </button>
                </div>
            </div>
        )
    }
}
export default LoginCustumer;