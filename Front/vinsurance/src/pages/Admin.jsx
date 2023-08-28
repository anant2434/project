import React from 'react'
import { Link } from 'react-router-dom'
const Admin = () => {
  return (
    <div>
      <table>
        <tr>
            <td>
                <tr><Link to="/addpolicy">Add Policy</Link></tr>
                <tr><Link to="/getuser">Users</Link></tr>
            </td>
        </tr>
      </table>
    </div>
  )
}

export default Admin
