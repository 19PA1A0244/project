import React from 'react';
import './tool.css';
import { Link } from "react-router-dom";
import {
  List,
  ListItem,
  ListItemText,
  Divider
}
from '@material-ui/core';

class DriverBar extends React.Component {
  render() {
    return (
      <div className='toolbar' >
        <br />
        <h3><b><i>Driver ToolBar</i></b></h3>
        <br />
        <List className='toolbar-items'>
          <Link to={"/driver/home"} className="link">
            <ListItem>
              <ListItemText primary={"All Pending Orders"} />
            </ListItem>
            <Divider />
          </Link>
          <Link to={"/driver/order"} className="link">
            <ListItem>
              <ListItemText primary={"My Active Order"} />
            </ListItem>
            <Divider />
          </Link>
          <Link to={"/driver/history"} className="link">
            <ListItem>
              <ListItemText primary={"My Order History"} />
            </ListItem>
            <Divider />
          </Link>
        </List>
      </div>
    );
  }
}

export default DriverBar;