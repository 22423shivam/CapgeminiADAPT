import React from 'react'
import { Link } from 'react-router-dom'

const Menu = () => {
    return(
        <>
            <Link exact to='/home'>Home</Link>
            <Link exact to='/projects'>Projects</Link>
            <Link exact to='/services'>Services</Link>
            <Link exact to='/contact'>Contact</Link>
            <br/>
            <br/>
            {/* <a href="/">About Us</a>
            <a href="/contact"> Contact</a> */}
        </>
    )
}

export default Menu