// packages/page.js
import React from 'react';

export default function Packages({ destination, fromDate, toDate, adults, children }) {
    // Fetch vacation packages based on form data
    // Replace the following with actual logic to fetch and display vacation packages
    const vacationPackages = [
        { name: 'Package 1', description: 'Description for Package 1' },
        { name: 'Package 2', description: 'Description for Package 2' },
        { name: 'Package 3', description: 'Description for Package 3' },
    ];

    return (
        <>
            <h1>Vacation Packages</h1>
            <p>Destination: {destination}</p>
            <p>From Date: {fromDate}</p>
            <p>To Date: {toDate}</p>
            <p>Number of Adults: {adults}</p>
            <p>Number of Children: {children}</p>

            <div>
                {vacationPackages.map((packageItem, index) => (
                    <div key={index}>
                        <h2>{packageItem.name}</h2>
                        <p>{packageItem.description}</p>
                        <hr />
                    </div>
                ))}
            </div>
        </>
    );
}
