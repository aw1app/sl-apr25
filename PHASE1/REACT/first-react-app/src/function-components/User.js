
const User = (props) => {
    return (
        <div>
            <h1>User Details</h1>
            <p>name:{props.name}</p>
            <p>email:{props.email}</p>
        </div>
    )
}
export default User;