const AnyReactComponent = ({ text }) => (
    <div style={{
        color: 'white',
        background: 'grey',
        padding: '15px 10px',
        display: 'inline-flex',
        textAlign: 'center',
        alignItems: 'center',
        justifyContent: 'center',
        borderRadius: '100%',
        transform: 'translate(-50%, -50%)'
    }}>
        {text}
    </div>
);

class SimpleMap extends React.Component {
    static defaultProps = {
        center: {lat: 37.554117, lng: 126.98848},
        zoom: 11
    };

    render() {
        return (
            <GoogleMapReact
                defaultCenter={this.props.center}
                defaultZoom={this.props.zoom}
            >
                <AnyReactComponent
                    lat={37.554117}
                    lng={126.98848}
                    text={'Circle Marker'}
                />
            </GoogleMapReact>
        );
    }
}


ReactDOM.render(
    <div style={{width: '50%', height: '600px'}}>
        <SimpleMap/>
    </div>,
    document.getElementById('root')
);
