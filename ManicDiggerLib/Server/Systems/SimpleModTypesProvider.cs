using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;

namespace ManicDigger
{
    /// <summary>
    /// Just a simple Provider for getting types for a mod from a special MOD-Namespace to make development easier
    /// </summary>
    internal class SimpleModTypesProvider 
        : IModTypesProvider
    {
        #region CONSTRUCTOR
        public SimpleModTypesProvider(string modName)
        {
            this.ActiveModName = modName;
        }
        #endregion

        #region METHODS
        /// <see cref="IModTypesProvider.GetTypes"/>
        public IEnumerable<Type> GetTypes()
        {
            string sModNamespace = string.Format("ManicDigger.Mods.{0}", this.ActiveModName);
            Assembly ownAssembly = Assembly.GetCallingAssembly();

            var allTypes = ownAssembly.GetTypes();

            // Find all types with the given Namespace and those whoch implement IMod
            var resultTypes = allTypes
                                .Where(x => x.Namespace != null && x.Namespace.Equals(sModNamespace))
                                .Where(x => x.GetInterfaces().Any(i => i.Equals(typeof(IMod))))
                                .ToArray();

            return resultTypes;
        }

        public Assembly GetModAssembly()
        {
            return Assembly.GetCallingAssembly();
        }
        #endregion

        #region PROPERTIES
        public string ActiveModName { get; private set; }
        #endregion

    }
}
