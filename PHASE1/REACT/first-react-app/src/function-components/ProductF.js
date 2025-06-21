function ProductF(props) {


    return (

        <div>
            <h3> Product info:</h3>
            <li> Name : {props.name}</li>
            <li> Export Limit: {props.exportLimit}</li>
            <li> Export Allowed : {props.exportLimit > 100 ? 'LIMIT EXCEEDED' : 'LIMIT ALLOWED'}</li>
        </div>

    )

}

export default ProductF;


// Task: Create an UserProfile functional comp