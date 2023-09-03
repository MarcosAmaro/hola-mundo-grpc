import React from 'react';
import ReactDOM from 'react-dom';
import CRUDTable,
{
  Fields,
  Field,
  UpdateForm,
} from 'react-crud-table';

// Component's Base CSS
import './css/index.css';

const service = {
  fetchItems: () => {
    const response = async () => {
      return await fetch("http://localhost:5000/getList")
        .then(response => response.json())
        .then(json => json.countries)
    };
    return response;
  },
  update: (data) => {
    const reqOpts = {
      method: 'POST',
      headers: { 'Content-type': 'application/json' },
      body: JSON.stringify(data)
    };

    fetch("http://localhost:5000/update", reqOpts);
    const response = fetch("http://localhost:5000/getList");

    return Promise.resolve(response);
  }
};

const styles = {
  container: { margin: 'auto', width: 'fit-content' },
};

const Example = () => (
  <div style={styles.container}>
    <CRUDTable
      caption="Countries"
      fetchItems={service.fetchItems()}
    >
      <Fields>
        <Field
          name="idCountry"
          label="Id"
          hideInCreateForm
          readOnly
        />
        <Field
          name="countryName"
          label="Country Name"
        />
        <Field
          name="regionName"
          label="Region"
          hideInUpdateForm
          readOnly
        />
        <Field
          name="countryCodeMain"
          label="Country Code"
        />
      </Fields>

      <UpdateForm
        title="Update Country"
        message="Update Country"
        trigger="Update"
        onSubmit={c => service.update(c)}
        submitText="Update"
        validate={(values) => {
          const errors = {};

          if (!values.countryName) {
            errors.title = 'Country Name is mandatory';
          }

          if (!values.countryCodeMain) {
            errors.description = 'Country Code is mandatory';
          }

          return errors;
        }}
      />
    </CRUDTable>
  </div>
);

Example.propTypes = {};

ReactDOM.render(
  <Example />,
  document.getElementById('root')
);