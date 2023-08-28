import React from 'react'
import Form from 'react-bootstrap/Form';

const Addpolicy = () => {
  return (
    <div>
      <Form>
        <h4>Registration</h4>
      <Form.Group className="mb-3" controlId="firstName">
        <Form.Label>First Name</Form.Label>
        <Form.Control type="text" placeholder="Enter First Name" />
      </Form.Group>
      
    </Form>
    </div>
  )
}

export default Addpolicy
