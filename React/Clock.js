import React from 'react'

const currDate = new Date().toLocaleDateString()
const currTime = new Date().toLocaleTimeString()

const Clock = () => {
    return(
        <>
            <br/>
            <h1>Digital Clock</h1>
            <h1>{currTime}</h1>
            <p>{currDate}</p>
            
        </>
    )
}

export default Clock